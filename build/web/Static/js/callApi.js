/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* global fetch */
function bc() {
    
}
function ApiFetch(sym) {
    //console.log("Passed Param + ",sym);
    /*const response = await fetch('https://www.alphavantage.co/query?function=TIME_SERIES_WEEKLY&symbol=MSFT&interval=15min&apikey=2GYHGJBDW7K34C0N');
    const data = await response.json();
    console.log(data["Weekly Time Series"]);
    return data;*/
    console.log("Passed Param + ",sym);
    fetch('https://www.alphavantage.co/query?function=TIME_SERIES_WEEKLY&symbol=MSFT&interval=15min&apikey=2GYHGJBDW7K34C0N').then(response=>{
        return response.json();
        
    }).then(json=>{
        
        
        console.log(json);
        console.log(json['Meta Data']['3. Last Refreshed']);
        window.localStorage.setItem("ApiResult",sym);
        
        
    })
    console.log("executed")
}
setInterval(()=>{
    
})
