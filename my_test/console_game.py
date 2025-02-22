from pypokerengine.api.game import setup_config, start_poker
from players import FishPlayer, ConsolePlayer

config = setup_config(max_round=10, initial_stack=100, small_blind_amount=5)
config.register_player(name="fish_player", algorithm=FishPlayer())
config.register_player(name="human_player", algorithm=ConsolePlayer())
game_result = start_poker(config, verbose=0)
