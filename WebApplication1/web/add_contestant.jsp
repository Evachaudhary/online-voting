<%-- 
    Document   : add_contestant
    Created on : Mar 12, 2018, 7:22:42 PM
    Author     : Eva
--%>

<!DOCTYPE html>
<html>
<style>
</style>
<title>ADD CONTESTANT </title>
<meta name="viewport" content="width=50px, initial-scale=13">
<link rel="stylesheet" href="css\style.css">
<body>

<div class="w3-container w3-padding-48 w3-teal">

            <p>
            <button class=" w3-button w3-white w3-padding-large">Result </button>
            &nbsp; &nbsp; &nbsp;
            <button class="w3-button w3-white w3-padding-large ">Candidate Profile </button>
            </p>

</div>

  
<div class="w3-container w3-padding-32 w3-white">
<div class="w3-container w3-center">

                 <h1> <candidate demo></h1>	
                 <form action="/action_page.php" method="post" >
                 <div style="margin-bottom:10px ;margin:20px ;margin-left:300px ;margin-right:400px;">
<div class="fieldset" style ="width:700px">
<legend style="margin-left:300px">  Add Contestant </legend>
<p>	
 
<table cellspacing="3">
  <tbody>
     <tr>
        <td>
           First Name:
        </td>
        <td>
           <input type="text" name="first"  required="required">
        </td>
        <td>
            Last Name:
        </td>
        <td> <input type="text" name="first"  required="required">
        </td>

     </tr>
     <tr>
        <td>
           Adhar Number:
        </td>
        <td>
           <input type="text" name="last"  required="required"> 
        </td>
         <td>
           Head Name :
        </td>
        <td>
           <input type="text" name="last"  required="required"> 
        </td>
     </tr>
      <tr>
        <td>
           Email:
        </td>
        <td>
           <input type="text" name="email"   required="required">
        </td>
         <td>
           Contact Number:
        </td>
        <td>
           <input type="Number" name="Contact Number"   required="required">
        </td>
     </tr>
     <tr>
        <td>
           Sex:
        </td>
        <td>
          <select name="case" required="required"><br>
                                      <option></option>
                                        <option value="text">Male</option>
                                        <option value="text">Female</option>

                                        <option>Other</option>
                                        </select>
        </td>
         <td>
           Age:
        </td>
        <td>
           <input type="Number" name="Age"  required="required">
        </td>
     </tr>

  </tbody>
</table>
<!--
</p>
                   
             
<p style="text-align:center; ">--><b>Criminal Case</b></p>
                                    <select name="case" required="required"><br>
                                    	<option></option>
                                        <option value="text">yes</option>
                                        <option value="text">No</option>
                                        <option></option>
                                        </select>
                                        
</p>

</div>
 <input type="submit" value="Submit">
<div class="w3-container w3-padding-32 w3-white">
</div>
</form>
</div>
</div>
<div class="footer">
<footer> </footer>	

</div>
</body>
</html> 












