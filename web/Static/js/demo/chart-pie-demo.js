// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = 'Nunito', '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#858796';


let data1 = document.currentScript.getAttribute('req');
let Symbols1 = data1.split(";");
Symbols1.pop();
let symbollist = [];
let priceList = [];
Symbols1.map((item)=>{
    let temp=item.split("-");
    symbollist.push(temp[0]);
    priceList.push(temp[1]);
});
console.log(symbollist);
console.log(priceList);
let colourList = [];
for(let i=0;i<symbollist.length;i++)
{
    colourList.push("#" + ((1<<24)*Math.random() | 0).toString(16));
}
console.log("Action Replay");
// Pie Chart Example
var ctx = document.getElementById("myPieChart");
var myPieChart = new Chart(ctx, {
  type: 'doughnut',
  data: {
    labels: symbollist,
    datasets: [{
      data: priceList,
      backgroundColor: colourList,
    }],
  },
  options: {
    maintainAspectRatio: false,
    tooltips: {
      backgroundColor: "rgb(255,255,255)",
      bodyFontColor: "#858796",
      borderColor: '#dddfeb',
      borderWidth: 1,
      xPadding: 15,
      yPadding: 15,
      displayColors: false,
      caretPadding: 10,
    },
    legend: {
      display: false
    },
    cutoutPercentage: 80,
  },
});
