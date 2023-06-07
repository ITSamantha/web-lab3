

function sendToServer(x, y, r) {
    let hiddenX = document.getElementById("hidden_form:graphic_x_hidden");
    let hiddenY = document.getElementById("hidden_form:graphic_y_hidden");
    let hiddenR = document.getElementById("hidden_form:graphic_r_hidden");

    hiddenX.setAttribute("value", x);
    hiddenY.setAttribute("value", y);
    hiddenR.setAttribute("value", r);

    console.log("Отправили на сервер... x =" + x + " y =" + y + " r =" + r)
    document.getElementById('hidden_form:graphic_button_hidden').click();
}

