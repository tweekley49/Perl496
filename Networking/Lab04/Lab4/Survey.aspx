<%@ Page Title="" Language="VB" MasterPageFile="~/MasterPage.master" AutoEventWireup="false" CodeFile="Survey.aspx.vb" Inherits="Lab4_Survey" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">

    <h1>COINS Survey</h1>

    Your Name:<input type="text" id="CustomerName" /> <br />
    Your Password:<input type ="password" id="CustomerPassword" /> <br />

    1. What courses have you taken so far? <br />
    <input type ="checkbox" name="courses" />Applied System
    <input type ="checkbox" name="courses" />Applied Networking
    <input type ="checkbox" name="courses" />Java1
    <input type ="checkbox" name="courses" />Java2<br />
    <input type ="checkbox" name="courses" />Data Structure
    <input type ="checkbox" name="courses" />Algorithm
    <input type ="checkbox" name="courses" />Architecture
    <input type ="checkbox" name="courses" />Advanced OS<br />

    2. What is the worst course you have taken? <br />
    <input type ="radio" name="worst" />Applied System
    <input type ="radio" name="worst" />Applied Networking
    <input type ="radio" name="worst" />Java1
    <input type ="radio" name="worst" />Java2<br />
    <input type ="radio" name="worst" />Data Structure
    <input type ="radio" name="worst" />Algorithm
    <input type ="radio" name="worst" />Architecture
    <input type ="radio" name="worst" />Advanced OS<br />

    3. How do you rate COINS?
    <select name ="rating">
        <option>Best</option>
        <option>Excellent</option>
        <option>Good</option>
        <option>Fair</option>
        <option>Poor</option>
        <option>Awful</option>
    </select>

    <input type="submit" />
    <input type ="reset" />


</asp:Content>

