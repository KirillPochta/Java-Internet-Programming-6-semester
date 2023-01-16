use java_ee_lab;

select *from dbo.TestUsers;

drop table TestUsers

CREATE TABLE TestUsers
(
Id int primary key,
Name nvarchar(50),
Age int
);


INSERT INTO TestUsers(Id, Name, Age) VALUES (1, ''name1'', 19);
INSERT INTO TestUsers(Id, Name, Age) VALUES (2, ''name2'', 22);

REVOKE SELECT ON dbo.TestUsers TO JavaUser

USE java_ee_lab;

GRANT SELECT ON dbo.TestUsers TO JavaUser;

GRANT EXECUTE ON OBJECT::SelectUserId
    TO JavaUser;

CREATE PROCEDURE SelectUserId
    @iden int
AS
BEGIN
  select *from TestUsers where id = @iden;
END;

declare @id int = 1;
begin
EXEC SelectUserId @id;
end;