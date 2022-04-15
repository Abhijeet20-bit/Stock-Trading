/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var Sym=document.currentScript.getAttribute('Data');
var time=[];
var keys=[];
var price=[];
console.log("Symbol: abhi "+Sym);
plotLine();
async function getData(sym) {
    console.log("Symbol: kk "+sym);
    const response = await fetch(`https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=${sym}&interval=5min&apikey=2GYHGJBDW7K34C0N`);
    const data = await response.json();
    const dailyData=data["Time Series (5min)"];
    keys=Object.keys(dailyData);
    time=keys.map((item)=>{
        return item.substring(11);
    })
    keys.map(item=>{
        price.push(dailyData[item]['1. open']);
    });
    
}

async function plotLine() {
    await getData(Sym);
    const xlabels = time.reverse(); 
    const ylabels = price.reverse();
    const data = {
      labels: xlabels,
      datasets: [{
        label: 'Stock Graph',
        backgroundColor: 'rgb(255, 99, 132)',
        borderColor: 'rgb(16, 179, 7)',
        data: ylabels,
      }]
    };

    const config = {
      type: 'line',
      data: data,
      options: {}
    };

    const myChart = new Chart(
      document.getElementById('myChart'),
      config
    );
}