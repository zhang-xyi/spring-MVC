function del(thisNode) {
    var msg = "确认删除" + thisNode.getAttribute("name") + "吗？"
    if (confirm(msg)) {
        return true
    } else {
        return false
    }
}

$(function () {
    $("#reset").click(function () {
        window.location.href = "http://localhost:8080/SSM_springMVC/empy/list";
    })


    $("#checkAll").click(function () {
        $("[name=\"empids\"]").prop("checked", $("#checkAll").prop("checked"))
    })


    $("#deleteBatch").click(function () {
        if ($("[name=\"empids\"]:checked").length>0) {
            if(confirm("确认删除吗？")){
                $("#delForm").submit()
            }
        }else {
            alert("请至少选择一项")
        }
    })

})

