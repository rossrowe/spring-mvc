<#include "header.ftl">

<div id="header">
  <h2>Books</h2>
</div>
<div id="content">

  <table class="table">
    <tr>
      <th>Title</th>
      <th>Author</th>
      <th>ISBN</th>
    </tr>
    <#list model["bookList"] as book>
      <tr>
        <td>${book.title}</td>
        <td>${book.author}</td>
        <td>${book.isbn}</td>

      </tr>
    </#list>
  </table>
</div>
<#include "footer.ftl">