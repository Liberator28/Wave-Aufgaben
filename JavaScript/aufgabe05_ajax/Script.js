/*
 * JS-Aufgabe 5: AJAX
 
 * Script-Datei im Head eingebunden.
 * Hinweis: Braucht einen HTTP-Server (z.B. Apache), weil AJAX über file:// nicht geht.
 */

$(document).ready(function () {

    // Teil a) Button klicken -> ajax.html laden
    $("#ladeAjaxBtn").on("click", function () {
        $("#ajaxZiel").load("ajax.html", function () {
            // Nachdem ajax.html geladen wurde: Klick-Event für den Button darin setzen
            $(".ladeAjaxIntern").on("click", function () {
                $(this).next(".internZiel").load("ajax.html");
            });
        });
    });

    // Teil b) ToDo-Liste beim Seitenaufruf laden
    if ($("#todoContainer").length > 0) {
        $("#todoContainer").load("../aufgabe03_todo.html");
    }
});
