/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* global fetch */
var price=0;
var Date;
function ans(sym) {
    document.getElementById("SelectResult").value=sym;
    console.log(sym + " In run ");
}
function getResult() {
    const symbol=document.getElementById("SelectResult");
    const Symvalue=symbol.value;
    fetch(`https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=${Symvalue}&apikey=2GYHGJBDW7K34C0N`).then(response=>{
        return response.json();
        
    }).then(data=>{
        const dailyData=data["Time Series (Daily)"];
        Date=Object.keys(dailyData)[0];
        price=dailyData[Object.keys(dailyData)[0]]['4. close'];
        console.log(price);
    });
    
    console.log(Symvalue);
}
function getAmount() {
    const Qty=document.getElementById("Quantity").value;
    let Amount=price*Qty;
    document.querySelector("#Amount").value=`\$${Amount}`;
    document.querySelector("#Date").value=`${Date}`;
}

