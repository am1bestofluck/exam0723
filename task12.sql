drop table if exists `all_animals`;
create table `all_animals` as (
	select 
		name,
        birthyear,
        breed,
        null as carryweight,
        learned_commands,
		'коты' as species
	from cats 
	UNION
    select 
		name,
        birthyear,
        breed,
        null as carryweight,
        learned_commands,
		'сабачки :3' as species
		from dogs 
		UNION
        select 
			name,
        birthyear,
        breed,
        null as carryweight,
        learned_commands,
		'комочки' as species
			from hamsters 
		UNION
        select 
		*,
		'лошадки' as species
		from horses
		UNION
        select 
		*,
		'верблюды' as species
		from camels
		UNION
        select 
		*,
        'ослики' as species
		from donkeys
	);
select * from all_animals;