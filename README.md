# StickyNotes

for (Notes i : board){
            if(i.x == cx && i.y == cy){
                System.out.println("Server cannot add note due to another note being here....");
                return;
            }
        }