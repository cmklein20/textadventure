I added new components for an entity type as well as an inventory component. I assign the inventory component to the player in the createPlayer function, and use the hash set on the component to add items to the players inventory. 

I use the TypeComponent to add a type to the created items, and check that type to make sure it's an 'item' before allowing the player to pick it up.
