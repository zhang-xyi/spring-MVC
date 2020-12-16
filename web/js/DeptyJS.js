
/*function del(thisNode) {
    var msg = "确认删除" + thisNode.getAttribute("name") + "吗？"
    if (confirm(msg)) {
        return true
    } else {
        return false
    }
}*/
/*function del() {
    var msg = "确认删除" + this.name + "吗？"
    return confirm(msg)

}*/
$(function () {
    $("#reset").click(function () {
        window.location.href = "http://localhost:8080/SSM_springMVC/depty/list";
    })


    $("#checkAll").click(function () {
        $("[name=\"deptnos\"]").prop("checked", $("#checkAll").prop("checked"))
    })


    $("#deleteBatch").click(function () {
        if ($("[name=\"deptnos\"]:checked").length>0) {
            if(confirm("确认删除吗？")){
                $("#delForm").submit()
            }
        }else {
            alert("请至少选择一项")
        }
    })
    
    $(".dell").click(function () {
        return confirm("确认要删除["+this.name+"]号部门吗")
    })

})

