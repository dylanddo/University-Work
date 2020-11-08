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
    
    $sql = "SELECT * FROM Student";     
    
    $query = $dbhandle->prepare($sql); // Prepare and ...
    if ( $query->execute() === FALSE ) { // ... execute the query
        die('Query exec error: ' . implode($query->errorInfo(),' '));
    }
    $results = $query->fetchAll(); // Put all the results in an array
    ?>
    
<h2>Task 6</h2> <!-- static HTML heading -->

<form action="task7.php" method="get">
    Select a student:
    <select name= "studentInfo">

        <?php 
            foreach ($results as $row) 
            { ?>
                <option value=<?php echo $row['sid']; ?>>
                    <?php echo $row['sid']; ?> 
                    <?php echo $row['forename']; ?> 
                    <?php echo $row['surname']; ?> 
                    <?php echo $row['gender']; ?> 
                </option>
        <?php 
        } ?>
    </select>
<input type="submit"/>
</form>

</body>
</html>