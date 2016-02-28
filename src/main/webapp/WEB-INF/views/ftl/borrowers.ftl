<#include "header.ftl">

<div id="header">
    <h2>Borrowers</h2>
</div>
<div id="content">

    <table class="table">
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th></th>
        </tr>
    <#list model["personList"] as person>
        <tr>
            <td>${person.name}</td>
            <td>${person.email}</td>
            <td>
                <button id="${person.id}_button">Show books</button>
            </td>
            <script type="text/javascript">
                $('#${person.id}_button').click(function () {

                    $.ajax({
                        url: 'borrower/listBooks',
                        type: 'POST',
                        data: {'personId': ${person.id}},
                        success: function (result) {
                            $('#borrow_details').html(result)

                        }
                    });

                });
            </script>

        </tr>
    </#list>
    </table>
    <div id="borrow_details"/>
</div>



<#include "footer.ftl">