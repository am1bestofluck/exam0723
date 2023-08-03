use `allies`;

drop table if exists `young_animals`;
create temporary table `young_animals` as (
	select 
		name,
		birthyear,
		breed,
		period_diff(
			date_format(curdate(),'%Y%m'),
			concat(birthyear,'01')
					) as age_in_months
	from cats 
	where
		period_diff(
			date_format(curdate(),'%Y%m'),
			concat(birthyear,'01')
					) between 12 and 35
	UNION
    select 
		name,
		birthyear,
		breed,
		period_diff(
			date_format(curdate(),'%Y%m'),
			concat(birthyear,'01')
					) as age_in_months
		from dogs 
		where
			period_diff(
				date_format(curdate(),'%Y%m'),
				concat(birthyear,'01')
						) between 12 and 35
		UNION
        select 
			name,
			birthyear,
			breed,
			period_diff(
				date_format(curdate(),'%Y%m'),
				concat(birthyear,'01')
						) as age_in_months
			from hamsters 
			where
				period_diff(
					date_format(curdate(),'%Y%m'),
					concat(birthyear,'01')
							) between 12 and 35
		UNION
        select 
		name,
		birthyear,
		breed,
		period_diff(
			date_format(curdate(),'%Y%m'),
			concat(birthyear,'01')
					) as age_in_months
		from horses
		where
			period_diff(
				date_format(curdate(),'%Y%m'),
				concat(birthyear,'01')
						) between 12 and 35
		UNION
        select 
		name,
		birthyear,
		breed,
		period_diff(
			date_format(curdate(),'%Y%m'),
			concat(birthyear,'01')
					) as age_in_months
		from camels
		where
			period_diff(
				date_format(curdate(),'%Y%m'),
				concat(birthyear,'01')
						) between 12 and 35
		UNION
        select 
		name,
		birthyear,
		breed,
		period_diff(
			date_format(curdate(),'%Y%m'),
			concat(birthyear,'01')
					) as age_in_months
		from donkeys
		where
			period_diff(
				date_format(curdate(),'%Y%m'),
				concat(birthyear,'01')
						) between 12 and 35
                );
select * from young_animals;