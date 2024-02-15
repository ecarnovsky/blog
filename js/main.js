let socialMediaIcons = document.querySelectorAll('footer a')

for(let i = 0; i < socialMediaIcons.length; i++){
    socialMediaIcons[i].addEventListener('mouseover', togglePopOut)
    socialMediaIcons[i].addEventListener('mouseout', togglePopOut)
}

function togglePopOut(){
    this.firstChild.classList.toggle("fa-beat")
}