function addNote(){
    var param ={
        title:"Merhaba",
        content:"Dünya",
    }
    var ser_data = JSON.stringify(param);
    $.ajax({
        type:"POST",
        contentType:'application/json; charset=UTF-8',
        url:"addNote",
        data: ser_date,
        success:function (data){
            alert(data);
        }
    })

}