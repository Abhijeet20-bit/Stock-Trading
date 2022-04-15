/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var price=0;
function getResult() {
    const symbol=document.getElementById("SelectResult");
    const Sym_Qty=symbol.value;
    const list=Sym_Qty.split("-");
    fetch(`https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=${list[0]}&apikey=2GYHGJBDW7K34C0N`).then(response=>{
        return response.json();
        
    }).then(data=>{
        const dailyData=data["Time Series (Daily)"];
        price=dailyData[Object.keys(dailyData)[0]]['4. close'];
        console.log(price);
    });
    
    
}
function checkQty() {
    console.log("inside func");
    const symbol=document.getElementById("SelectResult");
    const Sym_Qty=symbol.value;
    const list=Sym_Qty.split("-");
    const input=document.getElementById("Quantity").value;
    const qty=parseInt(list[1]);
    if(input>qty) {
        alert("Quantity must be less than "+qty);
        document.getElementById("Quantity").value=0;
    }
}
function getAmount() {
    const Qty=document.getElementById("Quantity").value;
    let Amount=price*Qty;
    document.querySelector("#Amount").value=`\$${Amount}`;
}
