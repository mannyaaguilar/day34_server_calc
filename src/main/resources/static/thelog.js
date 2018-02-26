$(document).ready(function(){
    var allChildren = $("#thelog").children().toArray();
    allChildren.shift();

    for(var i = 0; i < allChildren.length; i++){
        $(allChildren[i]).hide();
    }

    //.delay( 800 ).fadeIn( 400 );
    for(var i = 0; i < allChildren.length; i++){
        $(allChildren[i]).delay(i * 250).fadeIn(1000);
    }
});