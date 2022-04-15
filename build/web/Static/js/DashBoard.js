/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


console.log("Abhijeet: ", document.currentScript.getAttribute('Data'));
let data = document.currentScript.getAttribute('Data');
let Symbols = data.split(";");
Symbols.pop();
let totalReturnList = [];
        

async function getReturn(Data) {

let TotalReturn = 0;
    let value;
    for(let i=0;i<Data.length;i++)
    {
        let item = Data[i].split("-");
        let qty = item[1];
        let sym = item[0];
        console.log("Dailydata ",sym);
        const response = await fetch(`https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=${sym}&apikey=2GYHGJBDW7K34C0N`);
        const res = await response.json();
        const dailyData = res["Time Series (Daily)"];
        console.log("Dailydata ",dailyData);
        let currValue = dailyData[Object.keys(dailyData)[0]]['4. close'];
        TotalReturn += (parseFloat(currValue) * parseInt(qty));
        totalReturnList.push(TotalReturn);

    };
    console.log("TotalReturn: ", TotalReturn);
}
async function Result() {
    await getReturn(Symbols);
    let data=totalReturnList[totalReturnList.length-1];
    let invamt=document.getElementById("invamt").innerText;
    
    invamt=parseFloat(invamt.substring(1));
    console.log("abhi1 ",invamt);
    if(data-invamt < 0) 
    {
        document.getElementById("profit_loss").innerHTML="LOSS";
        document.getElementById("amt").innerHTML=`\$${invamt-data}`;
    }
    else
    {
        document.getElementById("profit_loss").innerHTML="PROFIT";
        document.getElementById("amt").innerHTML=`\$${data-invamt}`;
    }
    console.log();
}

Result();