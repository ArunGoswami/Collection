package JDBCPackage;

-- 1. Insert data into Employee Table
INSERT INTO Employee_Info (empId, empName, empSalary, empAddress, empMailId, empPhNo)
VALUES
    (1, 'John Doe', 50000, '123 Main St', 'john@example.com', '123-456-7890'),
    (2, 'Jane Smith', 60000, '456 Elm St', 'jane@example.com', '987-654-3210'),
    (3, 'Alice Johnson', 55000, '789 Oak St', 'alice@example.com', '111-222-3333');

-- 2. Update employee salary with the help of empId
UPDATE Employee_Info
SET empSalary = 65000
WHERE empId = 2;

-- 3. Delete employee who is getting maximum salary
DELETE FROM Employee_Info
WHERE empSalary = (SELECT MAX(empSalary) FROM Employee_Info);
