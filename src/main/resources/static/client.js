var requestArray = [null,null,null];

$(document).ready(function(){
    init();
});

function init(){
    guideExperience();
}

function guideExperience(){
    if(requestArray[0] == null){
        enableNumberGroup();
        disableOpGroup();
    } else if(requestArray[1] == null){
        disableNumberGroup();
        enableOpGroup();
    } else if(requestArray[2] == null){
        enableNumberGroup();
        disableOpGroup();
    }
}

function enableNumberGroup(){
    for(var i = 0; i < 10; i++){
        $("#calc" + i).on("click", clickNumber);
        $("#calc" + i).removeClass("disabled");
    }
}

function enableOpGroup(){
    $("#opAdd").on("click", clickOp);
    $("#opSub").on("click", clickOp);
    $("#opMulti").on("click", clickOp);
    $("#opDiv").on("click", clickOp);

    $("#opAdd").removeClass("disabled");
    $("#opSub").removeClass("disabled");
    $("#opMulti").removeClass("disabled");
    $("#opDiv").removeClass("disabled");
}

function disableNumberGroup(){
    for(var i = 0; i < 10; i++){
        $("#calc" + i).off("click", clickNumber);
        $("#calc" + i).addClass("disabled");
    }
}

function disableOpGroup(){
    $("#opAdd").off("click", clickOp);
    $("#opSub").off("click", clickOp);
    $("#opMulti").off("click", clickOp);
    $("#opDiv").off("click", clickOp);

    $("#opAdd").addClass("disabled");
    $("#opSub").addClass("disabled");
    $("#opMulti").addClass("disabled");
    $("#opDiv").addClass("disabled");
}

function clickNumber(){
    if(requestArray[0] == null){
        requestArray[0] = $(this).data("kitty");
        guideExperience();
    } else if(requestArray[2] == null){
        requestArray[2] = $(this).data("kitty");
        guideExperience();

        //send to server
        sendToServer(requestArray[0], requestArray[1], requestArray[2]);
    }

    console.log(requestArray);
}

function clickOp(){
    if(requestArray[1] == null){
        requestArray[1] = $(this).data("puppy");
        guideExperience();
    }

    console.log(requestArray);
}

function sendToServer(num1, op, num2){
    window.location.href = "/math/" + num1 + "/" + op + "/" + num2;
}

function goHome(){
    window.location.href = "/";
}

function goLog(){
    window.location.href = "/log";
}