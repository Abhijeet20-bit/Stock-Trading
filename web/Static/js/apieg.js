/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
console.log("Abhijeet: ", document.currentScript.getAttribute('Data'));
var Sym=document.currentScript.getAttribute('Data');
function fetchdata(sym) {
    fetch(`https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=${sym}&apikey=2GYHGJBDW7K34C0N`).then(response=>{
        if(!response.ok) {
            throw Error("Error");
        }
        return response.json();
    }).then((data)=>{
        const dailyData=data["Time Series (Daily)"];
        const currValue= dailyData[Object.keys(dailyData)[0]]['4. close'];
        const currHigh= dailyData[Object.keys(dailyData)[0]]['2. high'];
        const currLow= dailyData[Object.keys(dailyData)[0]]['3. low'];
        const prevClose=dailyData[Object.keys(dailyData)[1]]['4. close'];
        const volume=dailyData[Object.keys(dailyData)[0]]['5. volume'];
        
        document.querySelector("#CurrentValue").innerHTML = `\$${currValue}`;
        document.querySelector("#PrevClose").innerHTML = `\$${prevClose}`;
        document.querySelector("#TodaysHigh").innerHTML = `\$${currHigh}`;
        document.querySelector("#TodaysLow").innerHTML = `\$${currLow}`;
        document.querySelector("#VolumeCard").innerHTML = `${volume}`;
        console.log(dailyData);
        console.log(dailyData[Object.keys(dailyData)[0]]['1. open']);
        console.log(data['Meta Data']['2. Symbol']);
    }).catch(error => {
        console.log(error);
    });
    console.log("Chal gaya mai");
}
fetchdata(Sym);
