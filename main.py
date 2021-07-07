from Mini_0SemanticoUtils import Mini_0SemanticoUtils
import sys
from Mini_0Lexer import Mini_0Lexer
from Mini_0Parser import Mini_0Parser
from Mini_0Semantico import Mini_0Semantico
from antlr4 import *
import unittest
from io import StringIO
from os import listdir
from os.path import isfile, join

class TestMini_0(unittest.TestCase):

    def test_types(self):
        
        mypath = "tests/tests-sintactico/"
        
        onlyfiles = [f for f in listdir(mypath) if isfile(join(mypath, f))]
        for fileTest in onlyfiles:
            print("Running test " + fileTest)
            input = FileStream(mypath + fileTest)
            lexer = Mini_0Lexer(input)
            stream = CommonTokenStream(lexer)
            parser = Mini_0Parser(stream)
            tree = parser.programa()
            ars = Mini_0Semantico()
            ars.visitPrograma(tree)
            for error in ars.utils.semanticErrors:
                print(error)

if __name__ == '__main__':
    unittest.main()