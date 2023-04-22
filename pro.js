const num = document.querySelectorAll('.count');

let speed = 2000;
num.forEach((mynum)=>{
   let tar_num = mynum.dataset.count;
   let init_count = +mynum.innerText;

  let new_inc = Math.floor(tar_num/speed)
  const updatenum=()=>{
    init_count+= new_inc;
    mynum.innerText =init_count;
 if(init_count<tar_num)
 {
    setTimeout(()=>{
        updatenum()},1.4)
    
 }  

}
updatenum();

})