const username=document.getElementById('username')
const saveScoreBtn=document.getElementById("saveScoreBtn")
const finnalScore=document.getElementById('finalScore')
const mostRecentScore=localStorage.getItem('mostRecentScore')
localStorage.setItem("highScores",JSON.stringify([]))
console.log(JSON.parse(localStorage.getItem("highScores")))
finnalScore.innerText=mostRecentScore;
username.addEventListener('keyup',()=>{
    console.log(username.value);
    saveScoreBtn.disabled=!username.value;
})
