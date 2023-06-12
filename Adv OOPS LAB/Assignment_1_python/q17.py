#Q17. Write a function that flattens a nested dictionary structure like one obtain from
# Twitter and Facebook APIs or from some JSON file.

def flatten_dict(nested_dict, parent_key='', flattened_dict=None):
    if flattened_dict is None:
        flattened_dict = {}

    for key, value in nested_dict.items():
        new_key = f"{parent_key}.{key}" if parent_key else key

        if isinstance(value, dict):
            flatten_dict(value, new_key, flattened_dict)
        else:
            flattened_dict[new_key] = value

    return flattened_dict

# Example usage
nested = {
    'fullname': 'Alessandra',
    'age': 41,
    'phone-numbers': ['+447421234567', '+447423456789'],
    'residence': {
        'address': {
            'first-line': 'Alexandra Rd',
            'second-line': '',
        },
        'zip': 'N8 0PP',
        'city': 'London',
        'country': 'UK',
    }
}

flattened = flatten_dict(nested)
print(flattened)
