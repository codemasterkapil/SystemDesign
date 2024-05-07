package Vending_Machine_State_Design_Pattern;

public class Inventory {
    private ItemShelf[] inventory=null;

    public Inventory(int itemCount)
    {
        this.inventory=new ItemShelf[itemCount];
        initialEmptyInventory();
    }

    public ItemShelf[] getInventory()
    {
        return inventory;
    }

    private void initialEmptyInventory()
    {
        int initailCode=101;
        for(int i=0;i<inventory.length;i++)
        {
            ItemShelf space=new ItemShelf();
            space.setCode(initailCode);
            space.setSoldOut(true);
            inventory[i]=space;
            initailCode++;
        }
    }

    public void addItem(Item item,int codeNumber) throws Exception
    {
        for(ItemShelf itemShelf : inventory)
        {
            if(itemShelf.getCode()==codeNumber)
            {
                if(itemShelf.isSoldOut()){
                    itemShelf.setItem(item);
                    itemShelf.setSoldOut(false);
                }else{
                    throw new Exception("item is already present , you cannot add item here!!");
                }
            }
        }
        throw new Exception("Invalid Code");
    }

    public Item getItem(int codeNumber) throws Exception
    {
        for(ItemShelf itemShelf : inventory)
        {
            if(itemShelf.getCode()==codeNumber)
            {
                if(itemShelf.isSoldOut()){
                    throw new Exception("no item is present , you cannot get item here!!");
                }else {
                    Item item = itemShelf.getItem();
                    itemShelf.setItem(null);
                    itemShelf.setSoldOut(true);
                    return item;
                }
            }
        }
        throw new Exception("Invalid Code");
    }

    public void updateSoldOutItem(int codeNumber)
    {
        for(ItemShelf itemShelf : inventory)
        {
            if(itemShelf.getCode()==codeNumber)
            {
                itemShelf.setSoldOut(true);
            }
        }
    }
}
