window.onload = customize;

function customize() {
	window.document.getElementById('div3').style.display = 'none';
}

function convertNumber() {
	var value1 = window.document.getElementById('t1').value;
	var value2 = window.document.getElementById('t2').value;
	var type = document.querySelector('input[name="method"]:checked').value;
	var q_str = "type="+ type + "&value1=" + value1 + "&value2=" + value2;
	doAjax('MyConvertor_Servlet', q_str, 'convertNumber_back', 'post', 0);
}

function convertNumber_back(result) {
	if (result.substring(0, 5) == 'error') {
		window.document.getElementById('div3').style.display = 'block';
		window.document.getElementById('div3').innerHTML = "<p style='color:red;'><b>" + result.substring(6) + "</b></p>";
		window.document.getElementById('answer').value = "ERROR";
	} else {
		window.document.getElementById('answer').value = "" + result;
	}
}

