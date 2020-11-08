<!DOCTYPE html>
<html>
<style>

td, th, table { 
    border: solid 1px 
    }

table { 
    border-collapse: collapse 
}

</style>
<body>


<?php // Connect to database, and print error message if it fails
    try {
    $dbhandle = new PDO('mysql:host=dragon.kent.ac.uk; dbname=co323',
    'co323', 'h@v3fun');
    }
    catch (PDOException $e) { die('DB connect error: ' . $e->getMessage()); }
    
    $sql = "SELECT name, weighting FROM Assessment WHERE cid = ANY(SELECT cid FROM Course WHERE title = 'Database systems') ORDER BY name"; 
    // The SQL query itself
    
    $query = $dbhandle->prepare($sql); // Prepare and ...
    if ( $query->execute() === FALSE ) { // ... execute the query
        die('Query exec error: ' . implode($query->errorInfo(),' '));
    }
    $results = $query->fetchAll(); // Put all the results in an array
    ?>
    
<h2>Task 4</h2> <!-- static HTML heading -->

<table>
  <tr> 
    <th>Name</th> <th>Weighting</th> 
  </tr>
  <?php foreach ($results as $row) { ?>
    <tr>
      <td><?php echo $row['name']; ?></td>
      <td><?php echo $row['weighting']; ?></td>
    </tr>
  <?php } ?>
</table>

</body>
</html>