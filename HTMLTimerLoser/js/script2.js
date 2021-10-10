const secondText = document.getElementById('seconds');
const minuteText = document.getElementById('minutes');
const hourText = document.getElementById('hours');

let [milliseconds, seconds, minutes, hours] = [0,0,0,0];
let timerRef = document.querySelector('.timerDisplay');

let second = 0;
let minute = 0;
let hour = 0;
let int;

document.getElementById('startButton').addEventListener('click', () =>{
    int = setInterval(displayTimer, 1000);
});

function displayTimer(){
    second ++;
    secondText.textContent = second;
    if(second == 60){
        second = 0;
        minute ++;
        minuteText.textContent = minute;
    } else if (minute == 60) {
        minute = 0;
        hour ++;
        hourText.textContent = hour;
    }
}