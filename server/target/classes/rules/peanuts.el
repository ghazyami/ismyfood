positiveRuleMatch = !product.allergensTags.stream().anyMatch(t -> t.contains("peanut"))
message = positiveRuleMatch ? "Peanuts free" : "Not peanuts free"