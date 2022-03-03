import random

def guess(x):
    random_number = random.randint(1, x)
    guess = 0

    while guess != random_number:
        guess = int(input(f'Guess a numbem between 1 and {x}: '))
        if guess < random_number:
            print('Sorry, too low. Try again!')
        elif guess == random_number:
            print(f'Damn right! {random_number}')
        else:
            print('Too above, try again!')

guess(10)