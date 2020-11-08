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
    
    $sql = "SELECT a.cid, a.name, AVG(CASE WHEN a.aid = g.aid THEN mark END) avg_mark
    FROM Assessment a, Grade g
    GROUP BY a.aid, a.cid 
    ORDER BY a.cid, a.name"; // The SQL query itself
    
    $query = $dbhandle->prepare($sql); // Prepare and ...
    if ( $query->execute() === FALSE ) { // ... execute the query
        die('Query exec error: ' . implode($query->errorInfo(),' '));
    }
    $results = $query->fetchAll(); // Put all the results in an array
    ?>
    
<h2>Task 5</h2> <!-- static HTML heading -->

<table>
  <tr> 
    <th>cid</th> <th>Name</th> <th>Average Mark</th> 
  </tr>
  <?php foreach ($results as $row) { ?>
    <tr>
      <td><?php echo $row['cid']; ?></td>
      <td><?php echo $row['name']; ?></td>
      <td><?php echo $row['avg_mark']; ?></td>
    </tr>
  <?php } ?>
</table>

</body>
</html>