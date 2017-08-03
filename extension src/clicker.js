function redirect(path) {
  var winpath = path.replace("smb://", "%5C%5C");
  while (winpath.indexOf("/") !== -1) {
    winpath = winpath.replace("/", "%5C");
  }
  
  var xmlHttp = new XMLHttpRequest();
  xmlHttp.open("GET", "http://localhost:8000/open?path=" + winpath);
  xmlHttp.send(null);
  return false;
}
