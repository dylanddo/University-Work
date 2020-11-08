<!DOCTYPE html>
<html>
<style>

td, th, table { 
  border: solid 1px 
  }
  
table.table1 { 
  border-collapse: collapse 
  table-layout: fixed ;
  width: 100% ;
  }

  th {
    background-color: LightBlue;
  }
  
  tr:nth-child(even)  {
    background-color:  azure;
  }

  tr:hover {
    background-color: LightGrey;
  }
  
  h2.task {
    text-align: center;
  }

</style>
<body>

<?php // Connect to database, and print error message if it fails
    try {
    $dbhandle = new PDO('mysql:host=dragon.kent.ac.uk; dbname=co323',
    'co323', 'h@v3fun');
    }
    catch (PDOException $e) { die('DB connect error: ' . $e->getMessage()); }
    
    $sid = $_GET['studentInfo'];    
    // This gets the sid from task 6 when the user selects a student from the drop down menu. <option value=<?php echo $row['sid']; ? >

    $sql = "SELECT c.cid, c.title, a.name, a.weighting, g.mark
    FROM   Grade g, Assessment a, Course c
    WHERE  g.aid = a.aid AND a.cid = c.cid AND sid = '$sid'
    GROUP BY c.cid, a.aid";   
       
    $query = $dbhandle->prepare($sql); // Prepare and ...
    if ( $query->execute() === FALSE ) { // ... execute the query
        die('Query exec error: ' . implode($query->errorInfo(),' '));
    }
    $results = $query->fetchAll(); // Put all the results in an array



    $sql2= "SELECT c.cid, title, SUM(mark*weighting)/100 AS Weighted_Average 
    FROM   Grade g, Assessment a, Course c  
    WHERE  g.aid = a.aid AND a.cid = c.cid AND sid = '$sid'   
    GROUP BY cid;";    

    $query2= $dbhandle->prepare($sql2); // Prepare and ...
    if ( $query2->execute() === FALSE ) { // ... execute the query
        die('Query exec error: ' . implode($query2->errorInfo(),' '));
    }
    $results2 = $query2->fetchAll(); // Put all the results in an array

    ?>  

    

<h2 class = "task">Task 7</h2> <!-- static HTML heading -->
<h2><?php echo $sid ?> Details</h2>


<table class = table1>
  <tr> 
    <th>cid</th> <th>Title</th> <th>Name</th> <th>Weighting</th> <th>Mark</th>
  </tr>
  <?php foreach ($results as $row) { ?>
    <tr>
      <td><?php echo $row['cid']; ?></td>
      <td><?php echo $row['title']; ?></td>
      <td><?php echo $row['name']; ?></td>
      <td><?php echo $row['weighting']; ?></td>
      <td><?php echo $row['mark']; ?></td>
    </tr>
  <?php } ?>
</table>


<br/>
<br/>
<h2><?php echo $sid ?> Final Result</h2>
<table>
  <tr> 
    <th>cid</th> <th>Title</th> <th>Weighted Average</th> 
  </tr>
  <?php foreach ($results2 as $row2) { ?>
    <tr>
    <td><?php echo $row2['cid']; ?></td>
    <td><?php echo $row['title']; ?></td>
    <td><?php echo $row2['Weighted_Average']; ?></td>
    </tr>
  <?php } ?>
</table>

<!-- 
<h2> < ? php echo $sid Final Result ? > </h2> 
and 
<h2> < ? php echo $_GET['studentInfo']; ?> Final Result </h2> 
output the same result -->

</body>
</html>