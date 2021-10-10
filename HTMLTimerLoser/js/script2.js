let [hours, minutes, seconds] = [0,0,0];
let timerRef = document.querySelector('.timerDisplay');
let intervalID = 0;


document.getElementById('startButton').addEventListener('click', () =>{
    intervalID = setInterval(displayTimer, 1000);
});

document.getElementById('stopButton').addEventListener('click', ()=>{
    clearInterval(intervalID);
    [hours, minutes, seconds] = [0,0,0];
    timerRef.innerHTML = `00 : 00 : 00`;
});

function displayTimer(){
    seconds ++;
    if(seconds == 60){
        seconds = 0;
        minutes ++;
    } if (minutes == 60) {
        minutes = 0;
        hours ++;
    } if (hours == 24){
        hours = 0;
    }

    let h = hours < 10 ? "0" + hours : hours;
    let m = minutes < 10 ? "0" + minutes : minutes;
    let s = seconds < 10 ? "0" + seconds : seconds;

    timerRef.innerHTML = `${h} : ${m} : ${s}`;
}