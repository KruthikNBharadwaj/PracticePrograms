def count_yrs(document):
    distint_yrs=0;
    year_set=set()
    tokens=document.split(" ")
    for token in tokens:
        if len(token)==10 and token.count("-")==2:
            date_parts=token.split("-")
            if date_parts[2].isdigit() and len(date_parts[2])==4:
                year=int(date_parts[2])
                
                if 0000<=year<=9999:
                    year_set.add(year)
    distint_yrs=len(year_set)
    return distint_yrs

document=input()
result=count_yrs(document)
print(result)