<#-- @ftlvariable name="" type="nl.knaw.dans.dku.api.RnaInformationView" -->
<html>
    <body>
        <h1>RNA list</h1>

        <table>
            <tr>
                <th>id</th>
                <th>description</th>
                <th>upi</th>
            </tr>

            <#list items as item>
                <tr>
                    <td>${item.id}</td>
                    <td>${item.description}</td>
                    <td>${item.upi}</td>
                </tr>
            </#list>
        </table>
    </body>
</html>