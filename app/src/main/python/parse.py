# -*- coding: utf-8 -*-
from wiktionaryparser import WiktionaryParser
from pywiktionary import WiktionaryParserFactory


parser_factory = WiktionaryParserFactory('en')
pizza_parser = parser_factory.get_page('pizza')
parsing_result = pizza_parser.parse()
print(parsing_result)
