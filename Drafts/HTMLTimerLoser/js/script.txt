const timerText = document.getElementById("seconds");
const startButton = document.getElementById("startButton");
const stopButton = document.getElementById("stopButton");

let count = 0;
let intervalID;

startButton.addEventListener("click", function(){
    intervalID = setInterval(function(){
        count += 1;
        timerText.textContent = count;
    }, 1000)
});

stopButton.addEventListener("click", function() {
    clearInterval(intervalID);
    count = 0;
    timerText.textContent = count;
});