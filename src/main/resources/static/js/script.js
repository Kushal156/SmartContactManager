function changeTheme(){
	//set to web page
	document.querySelector("html").classList.add(currentTheme);
	
	//set the listener to the theme button
	const changeThemeButton = document.querySelector("#theme_change_button");
	changeThemeButton.addEventListener("click",(event) => {
		console.log("Change theme button is clicked");
		if(currentTheme == "dark"){
			//theme to light 
			currentTheme = "light";
		} else{
			currentTheme = "dark";
		}
	})
}