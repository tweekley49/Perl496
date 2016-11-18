<%@ Page Title="" Language="VB" MasterPageFile="~/MasterPage.master" AutoEventWireup="false" CodeFile="problem2.aspx.vb" Inherits="Lab4_problem2" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">


    <table border="1" style="width:50%; border-collapse:collapse"">
        <tr>
            <th colspan="5">Food</th>
        </tr>
        <tr>
            <td colspan="2"> </td>
            <th>Breakfast</th>
            <th>Lunch</th>
            <th>Dinner</th>
        </tr>
        <tr>
            <th rowspan="5">Food</th>
        </tr>
        <tr>
            <th>Bread</th>
            <td><center>5 grams</center> </td>
            <td><center>0 grams</center> </td>
            <td><center>0 grams</center> </td>            
        </tr>
       <tr>
            <th>Main Course</th>
            <td><center>0 grams</center> </td>
            <td><center>50 grams</center> </td>
            <td><center>100 grams</center> </td>
       </tr>

        <tr>
            <th>Vegetables</th>
            <td><center>0 grams</center> </td>
            <td><center>10 grams</center> </td>
            <td><center>15 grams</center> </td>
        </tr>
        <tr>
            <th>Dessert</th>
            <td><center>0 grams</center> </td>
            <td><center>0 grams</center> </td>
            <td><center>20 grams</center> </td>
        </tr>


    </table>


    <a href="lab04.aspx">Go Back</a>

</asp:Content>

