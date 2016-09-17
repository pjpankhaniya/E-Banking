$(document).ready(function() {
	$("#content").load("home.html");
});

$("li#l1 a").click(function() {
	
	var page = $(this).attr("href");
	$("#content").load(page + ".html");
	return false;
});