eps_mash = 1.0 
e_ = eps_mash + 1.0 

while e_ > 1.0:
    eps_mash = 0.5 * eps_mash 
    e_ = eps_mash + 1.0 

eps_mash = 2 * eps_mash 
print(eps_mash)