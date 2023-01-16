use java_ee_lab
go
CREATE PROCEDURE SelectUserId
	@id int
AS   begin
    select top 1 * from TestUsers where TestUsers.Id = id;
end;
go
EXECUTE SelectUserId 1;
go 
drop procedure SelectUserId;
