$(document).ready(function(){
    $("#p1").mouseup(function(){
        alert("鼠标在段落上松开。");
    });
    $("#ll").click( function(){
        ww();
    });
});

$("#addQA").on("click",function () {
    var ue = UE.getEditor('container');
    $("input[name='answer']").val(ue.getContent());
})

function ww(){
    alert("1232");
}