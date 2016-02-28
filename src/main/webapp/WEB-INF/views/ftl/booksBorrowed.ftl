<table class="table">
    <tr>
        <th>Title</th>
        <th>Author</th>
        <th>ISBN</th>
    </tr>
<#if model['borrower'].booksBorrowed?has_content >
    <#list model['borrower'].booksBorrowed as book>
        <tr>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.isbn}</td>
        </tr>
    </#list>
<#else>
<tr>
    <td colspan="3">No books borrowed</td>
</#if>
</table>