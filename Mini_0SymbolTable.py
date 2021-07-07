from enum import Enum

class Mini_0SymbolTableEntry :
    def __init__(self, name: str, type):
        self.name = name
        self.type = type

class Mini_0SymbolTable:
    class Mini_0Type(Enum):
        NUMERO = 1
        STRING = 2
        BOOL = 3
        CHAR = 4
        INVALIDO = 5
        FUNCION = 6
    
    def __init__(self):
        self.table = {}

    def insert(self, name, type):
        self.table[name] = Mini_0SymbolTableEntry(name, type)

    def exists(self, name):
        return name in self.table.values()

    def verify(self, name):
        if self.table[name] != None:
            return self.table[name].type
        else:
            return self.TipoMini0.INVALIDO
