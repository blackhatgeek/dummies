#!/bin/bash
while true; do
	CHARGE=$(acpi|cut -d' ' -f3)
	HRS=$(acpi|cut -d' ' -f5|cut -d':' -f1)
	MIN=$(acpi|cut -d' ' -f5|cut -d':' -f2)
	SEC=$(acpi|cut -d' ' -f5|cut -d':' -f3)
	
	if [ "$CHARGE" != "Charging," ] && [ "$HRS" = "00" ] && [ "$MIN" -le "10" ]; then 
		(echo "Low battery!"; sleep 10) | dzen2 -bg darkred -fg grey80 -fn fixed
	else sleep 300; fi
done