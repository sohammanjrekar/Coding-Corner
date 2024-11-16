import redis

# Connect to the Redis server
r = redis.Redis(host='localhost', port=6379, decode_responses=True)

# Set the value of the key 'foo' to 'bar'
r.set('foo', 'bar')

# Get the value of the key 'foo'
ans = r.get('foo')

# Print the retrieved value
print(ans)  # Should output: bar
