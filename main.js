var s = document.createElement('script');
s.src = chrome.extension.getURL('clicker.js');
s.onload = function() {
    this.remove();
};
(document.head || document.documentElement).appendChild(s);

addAttributes();

function addAttributes() {
  var links = document.getElementsByClassName('smNode file');
  for (i = 0; i < links.length; i++) {
    var path = links[i].href;
    links[i].setAttribute('onclick', 'return redirect(\'' + path + '\')');
  }
}

// var btn = document.createElement("BUTTON")
// var t = document.createTextNode("CLICK ME");
// btn.appendChild(t);
// //Appending to DOM
// document.body.appendChild(btn);
